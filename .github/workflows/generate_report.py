import xml.etree.ElementTree as ET
import os

def read_xml_to_text(input_directory, output_file):
    with open(output_file, 'w') as outfile:
        for filename in os.listdir(input_directory):
            if filename.endswith('.xml'):
                filepath = os.path.join(input_directory, filename)
                with open(filepath, 'r') as file:
                    for line in file:
                        outfile.write(line)

def parse_junit_xml(directory):
    results = {"total": 0, "passed": 0, "failed": 0, "skipped": 0, "missing": [], "incorrect": []}
    for file in os.listdir(directory):
        if file.endswith(".xml"):
            path = os.path.join(directory, file)
            tree = ET.parse(path)
            root = tree.getroot()
            for testcase in root.findall(".//testcase"):
                results["total"] += 1
                failure = testcase.find("failure")
                if testcase.find("failure") is not None:
                    results["failed"] += 1
                    if failure.get('message').startswith("MISSING:"):
                        results["missing"].append(failure.get('message')[8:])
                    else:
                        results["incorrect"].append(failure.get('message'))
                elif testcase.find("skipped") is not None:
                    results["skipped"] += 1
                else:
                    results["passed"] += 1
    return results

def parse_junit_xml_effort(directory):
    results = ""
    for file in os.listdir(directory):
        if file.endswith(".xml"):
            path = os.path.join(directory, file)
            tree = ET.parse(path)
            root = tree.getroot()
            for testcase in root.findall(".//testcase"):
                for failure in testcase.findall('failure'):
                    if 'NoSuchMethodException' in failure.get('type') or 'NoSuchMethodException' in failure.text:
                        results += failure.text + "\n"
    return results

def parse_pmd_xml(directory):
    results = {}
    for file in os.listdir(directory):
        if file.endswith(".xml"):
            print("file: ")
            print(file)
            path = os.path.join(directory, file)
            tree = ET.parse(path)
            root = tree.getroot()
            for file in root.findall(".//file"):
                print("file: ")
                print(file.get('name'))
                filename = file.get('name')
                results[filename] = []
                for violation in file.findall('violation'):
                    violation_obj = {
                        "text": violation.text,
                        "line": violation.get('beginline')
                    }
                    results[filename].append(violation_obj)
    print("results: ")
    print(results)
    return results

def generate_report(results, pmd_results, output_file):
    with open(output_file, "w") as f:
        f.write("Test Results Summary\n")
        f.write("===================\n")
        f.write(f"Total Tests: {results['total']}\n")
        f.write(f"Passed: {results['passed']}\n")
        f.write(f"Failed: {results['failed']}\n")
        f.write(f"Skipped: {results['skipped']}\n")
        f.write("\n")
        f.write("Missing Tests\n")
        f.write("=============\n")
        for missing in results["missing"]:
            f.write(missing + "\n")
        f.write("\n")
        f.write("Incorrect Tests\n")
        f.write("===============\n")
        for incorrect in results["incorrect"]:
            f.write(incorrect + "\n")
        f.write("\n")
        f.write("PMD Results\n")
        f.write("===========\n")
        for file, violations in pmd_results.items():
            f.write(f"File: {file}\n")
            for violation in violations:
                f.write(f"Line {violation['line']}: {violation['text']}\n")


xml_directory = 'target/surefire-reports'
output_text_file = 'test-report.txt'
# read_xml_to_text(xml_directory, output_text_file)
results = parse_junit_xml(xml_directory)
pmd_results = parse_pmd_xml('target/pmd')
generate_report(results, pmd_results, output_text_file)
