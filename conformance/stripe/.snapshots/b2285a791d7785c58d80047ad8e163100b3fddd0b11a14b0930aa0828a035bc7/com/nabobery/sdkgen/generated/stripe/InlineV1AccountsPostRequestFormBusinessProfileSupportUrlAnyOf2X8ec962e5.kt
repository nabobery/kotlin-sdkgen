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
 * oded/schema/properties/business_profile/properties/support_url/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/business_profile/properties/support_url/anyOf/1
 */
@Serializable(with = InlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5) {
      encoder.encodeString(value.value)
    }
  }
}
