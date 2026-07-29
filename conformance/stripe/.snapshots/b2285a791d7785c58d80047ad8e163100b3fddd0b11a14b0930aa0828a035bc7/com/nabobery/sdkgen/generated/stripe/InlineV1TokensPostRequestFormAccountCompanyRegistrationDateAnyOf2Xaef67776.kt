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
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/company/properties/registration_date/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/company/properties/registration_date/anyOf/1
 */
@Serializable(with = InlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776.Serializer::class)
public sealed class InlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormAccountCompanyRegistrationDateAnyOf2Xaef67776) {
      encoder.encodeString(value.value)
    }
  }
}
