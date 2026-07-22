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
 * sdkgen://source/openapi.yaml#/components/schemas/code-quality-setup-update/properties/languages/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-quality-setup-update/properties/languages/items
 */
@Serializable(with = InlineCodeQualitySetupUpdateLanguagesItemX6f44531c.Serializer::class)
public sealed class InlineCodeQualitySetupUpdateLanguagesItemX6f44531c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `csharp`.
   */
  public data object Csharp : InlineCodeQualitySetupUpdateLanguagesItemX6f44531c() {
    public override val `value`: String = "csharp"
  }

  /**
   * Documented value. Wire value: `go`.
   */
  public data object Go : InlineCodeQualitySetupUpdateLanguagesItemX6f44531c() {
    public override val `value`: String = "go"
  }

  /**
   * Documented value. Wire value: `java-kotlin`.
   */
  public data object JavaKotlin : InlineCodeQualitySetupUpdateLanguagesItemX6f44531c() {
    public override val `value`: String = "java-kotlin"
  }

  /**
   * Documented value. Wire value: `javascript-typescript`.
   */
  public data object JavascriptTypescript : InlineCodeQualitySetupUpdateLanguagesItemX6f44531c() {
    public override val `value`: String = "javascript-typescript"
  }

  /**
   * Documented value. Wire value: `python`.
   */
  public data object Python : InlineCodeQualitySetupUpdateLanguagesItemX6f44531c() {
    public override val `value`: String = "python"
  }

  /**
   * Documented value. Wire value: `ruby`.
   */
  public data object Ruby : InlineCodeQualitySetupUpdateLanguagesItemX6f44531c() {
    public override val `value`: String = "ruby"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeQualitySetupUpdateLanguagesItemX6f44531c()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeQualitySetupUpdateLanguagesItemX6f44531c = when (value) {
      Csharp.value -> Csharp
      Go.value -> Go
      JavaKotlin.value -> JavaKotlin
      JavascriptTypescript.value -> JavascriptTypescript
      Python.value -> Python
      Ruby.value -> Ruby
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCodeQualitySetupUpdateLanguagesItemX6f44531c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeQualitySetupUpdateLanguagesItemX6f44531c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeQualitySetupUpdateLanguagesItemX6f44531c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeQualitySetupUpdateLanguagesItemX6f44531c) {
      encoder.encodeString(value.value)
    }
  }
}
