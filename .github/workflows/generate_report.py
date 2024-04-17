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
                if testcase.find("failure") is not None:
                    results["failed"] += 1
                    if failure.text.startswith("MISSING:"):
                        results["missing"].append(failure.text)
                    else:
                        results["incorrect"].append(failure.text)
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

def generate_report(results, output_file):
    with open(output_file, "w") as f:
        f.write("Test Results Summary\n")
        f.write("===================\n")
        f.write(results)
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



xml_directory = 'target/surefire-reports'
output_text_file = 'test-report.txt'
# read_xml_to_text(xml_directory, output_text_file)
results = parse_junit_xml(xml_directory)
generate_report(results, output_text_file)
