package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The method used to generate the code challenge
 */
@Serializable(with = InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesCode676847a5
  .Serializer::class)
public sealed class InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesCode676847a5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `S256`.
   */
  public data object S256 : InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesCode676847a5() {
    public override val `value`: String = "S256"
  }

  /**
   * Documented value. Wire value: `plain`.
   */
  public data object Plain : InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesCode676847a5() {
    public override val `value`: String = "plain"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesCode676847a5()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesCode676847a5 = when (value) {
      S256.value -> S256
      Plain.value -> Plain
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesCode676847a5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesCode676847a5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesCode676847a5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesCode676847a5) {
      encoder.encodeString(value.value)
    }
  }
}
