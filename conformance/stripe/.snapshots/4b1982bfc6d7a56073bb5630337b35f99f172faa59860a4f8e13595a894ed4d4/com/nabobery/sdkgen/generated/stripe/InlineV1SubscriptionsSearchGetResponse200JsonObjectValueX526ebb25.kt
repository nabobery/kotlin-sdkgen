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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1search/get/responses/200/content/application~1json/schema/pr
 * operties/object
 */
@Serializable(with = InlineV1SubscriptionsSearchGetResponse200JsonObjectValueX526ebb25.Serializer::class)
public sealed class InlineV1SubscriptionsSearchGetResponse200JsonObjectValueX526ebb25 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `search_result`.
   */
  public data object SearchResult : InlineV1SubscriptionsSearchGetResponse200JsonObjectValueX526ebb25() {
    public override val `value`: String = "search_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsSearchGetResponse200JsonObjectValueX526ebb25()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsSearchGetResponse200JsonObjectValueX526ebb25 = when (value) {
      SearchResult.value -> SearchResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsSearchGetResponse200JsonObjectValueX526ebb25> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsSearchGetResponse200JsonObjectValueX526ebb25", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsSearchGetResponse200JsonObjectValueX526ebb25 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsSearchGetResponse200JsonObjectValueX526ebb25) {
      encoder.encodeString(value.value)
    }
  }
}
