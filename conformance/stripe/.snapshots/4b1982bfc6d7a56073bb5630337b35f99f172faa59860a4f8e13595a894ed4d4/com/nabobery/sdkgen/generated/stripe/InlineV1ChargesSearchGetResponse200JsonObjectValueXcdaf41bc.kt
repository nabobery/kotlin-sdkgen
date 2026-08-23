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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1search/get/responses/200/content/application~1json/schema/properti
 * es/object
 */
@Serializable(with = InlineV1ChargesSearchGetResponse200JsonObjectValueXcdaf41bc.Serializer::class)
public sealed class InlineV1ChargesSearchGetResponse200JsonObjectValueXcdaf41bc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `search_result`.
   */
  public data object SearchResult : InlineV1ChargesSearchGetResponse200JsonObjectValueXcdaf41bc() {
    public override val `value`: String = "search_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1ChargesSearchGetResponse200JsonObjectValueXcdaf41bc()

  public companion object {
    public fun fromValue(`value`: String): InlineV1ChargesSearchGetResponse200JsonObjectValueXcdaf41bc = when (value) {
      SearchResult.value -> SearchResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1ChargesSearchGetResponse200JsonObjectValueXcdaf41bc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1ChargesSearchGetResponse200JsonObjectValueXcdaf41bc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1ChargesSearchGetResponse200JsonObjectValueXcdaf41bc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesSearchGetResponse200JsonObjectValueXcdaf41bc) {
      encoder.encodeString(value.value)
    }
  }
}
