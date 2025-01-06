try:
    __import__("nonexistent_module")
except ImportError as e:
    print("Class/Module not found:", e)
