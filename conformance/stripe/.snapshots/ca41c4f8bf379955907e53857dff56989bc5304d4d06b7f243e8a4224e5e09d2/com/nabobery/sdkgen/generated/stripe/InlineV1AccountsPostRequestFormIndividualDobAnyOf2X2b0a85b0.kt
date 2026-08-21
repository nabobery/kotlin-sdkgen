package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/individual/properties/dob/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/individual/properties/dob/anyOf/1
 */
@Serializable(with = InlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0) {
      encoder.encodeString(value.value)
    }
  }
}
