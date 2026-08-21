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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/code-quality-setup/properties/languages/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-quality-setup/properties/languages/items
 */
@Serializable(with = InlineCodeQualitySetupLanguagesItemXf18f2ebd.Serializer::class)
public sealed class InlineCodeQualitySetupLanguagesItemXf18f2ebd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `csharp`.
   */
  public data object Csharp : InlineCodeQualitySetupLanguagesItemXf18f2ebd() {
    public override val `value`: String = "csharp"
  }

  /**
   * Documented value. Wire value: `go`.
   */
  public data object Go : InlineCodeQualitySetupLanguagesItemXf18f2ebd() {
    public override val `value`: String = "go"
  }

  /**
   * Documented value. Wire value: `java-kotlin`.
   */
  public data object JavaKotlin : InlineCodeQualitySetupLanguagesItemXf18f2ebd() {
    public override val `value`: String = "java-kotlin"
  }

  /**
   * Documented value. Wire value: `javascript-typescript`.
   */
  public data object JavascriptTypescript : InlineCodeQualitySetupLanguagesItemXf18f2ebd() {
    public override val `value`: String = "javascript-typescript"
  }

  /**
   * Documented value. Wire value: `python`.
   */
  public data object Python : InlineCodeQualitySetupLanguagesItemXf18f2ebd() {
    public override val `value`: String = "python"
  }

  /**
   * Documented value. Wire value: `ruby`.
   */
  public data object Ruby : InlineCodeQualitySetupLanguagesItemXf18f2ebd() {
    public override val `value`: String = "ruby"
  }

  /**
   * Documented value. Wire value: `rust`.
   */
  public data object Rust : InlineCodeQualitySetupLanguagesItemXf18f2ebd() {
    public override val `value`: String = "rust"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeQualitySetupLanguagesItemXf18f2ebd()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeQualitySetupLanguagesItemXf18f2ebd = when (value) {
      Csharp.value -> Csharp
      Go.value -> Go
      JavaKotlin.value -> JavaKotlin
      JavascriptTypescript.value -> JavascriptTypescript
      Python.value -> Python
      Ruby.value -> Ruby
      Rust.value -> Rust
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeQualitySetupLanguagesItemXf18f2ebd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeQualitySetupLanguagesItemXf18f2ebd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeQualitySetupLanguagesItemXf18f2ebd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeQualitySetupLanguagesItemXf18f2ebd) {
      encoder.encodeString(value.value)
    }
  }
}
