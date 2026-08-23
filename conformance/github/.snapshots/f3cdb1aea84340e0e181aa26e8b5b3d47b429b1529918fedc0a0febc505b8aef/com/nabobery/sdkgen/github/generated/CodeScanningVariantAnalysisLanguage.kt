package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The language targeted by the CodeQL query
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-variant-analysis-language
 */
@Serializable(with = CodeScanningVariantAnalysisLanguage.Serializer::class)
public sealed class CodeScanningVariantAnalysisLanguage {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `actions`.
   */
  public data object Actions : CodeScanningVariantAnalysisLanguage() {
    public override val `value`: String = "actions"
  }

  /**
   * Documented value. Wire value: `cpp`.
   */
  public data object Cpp : CodeScanningVariantAnalysisLanguage() {
    public override val `value`: String = "cpp"
  }

  /**
   * Documented value. Wire value: `csharp`.
   */
  public data object Csharp : CodeScanningVariantAnalysisLanguage() {
    public override val `value`: String = "csharp"
  }

  /**
   * Documented value. Wire value: `go`.
   */
  public data object Go : CodeScanningVariantAnalysisLanguage() {
    public override val `value`: String = "go"
  }

  /**
   * Documented value. Wire value: `java`.
   */
  public data object Java : CodeScanningVariantAnalysisLanguage() {
    public override val `value`: String = "java"
  }

  /**
   * Documented value. Wire value: `javascript`.
   */
  public data object Javascript : CodeScanningVariantAnalysisLanguage() {
    public override val `value`: String = "javascript"
  }

  /**
   * Documented value. Wire value: `python`.
   */
  public data object Python : CodeScanningVariantAnalysisLanguage() {
    public override val `value`: String = "python"
  }

  /**
   * Documented value. Wire value: `ruby`.
   */
  public data object Ruby : CodeScanningVariantAnalysisLanguage() {
    public override val `value`: String = "ruby"
  }

  /**
   * Documented value. Wire value: `rust`.
   */
  public data object Rust : CodeScanningVariantAnalysisLanguage() {
    public override val `value`: String = "rust"
  }

  /**
   * Documented value. Wire value: `swift`.
   */
  public data object Swift : CodeScanningVariantAnalysisLanguage() {
    public override val `value`: String = "swift"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : CodeScanningVariantAnalysisLanguage()

  public companion object {
    public fun fromValue(`value`: String): CodeScanningVariantAnalysisLanguage = when (value) {
      Actions.value -> Actions
      Cpp.value -> Cpp
      Csharp.value -> Csharp
      Go.value -> Go
      Java.value -> Java
      Javascript.value -> Javascript
      Python.value -> Python
      Ruby.value -> Ruby
      Rust.value -> Rust
      Swift.value -> Swift
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<CodeScanningVariantAnalysisLanguage> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.CodeScanningVariantAnalysisLanguage", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): CodeScanningVariantAnalysisLanguage = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: CodeScanningVariantAnalysisLanguage) {
      encoder.encodeString(value.value)
    }
  }
}
