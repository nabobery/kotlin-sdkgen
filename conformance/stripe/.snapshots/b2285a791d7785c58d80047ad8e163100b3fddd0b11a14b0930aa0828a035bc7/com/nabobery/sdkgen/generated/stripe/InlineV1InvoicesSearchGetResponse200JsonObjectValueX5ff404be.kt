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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1search/get/responses/200/content/application~1json/schema/propert
 * ies/object
 */
@Serializable(with = InlineV1InvoicesSearchGetResponse200JsonObjectValueX5ff404be.Serializer::class)
public sealed class InlineV1InvoicesSearchGetResponse200JsonObjectValueX5ff404be {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `search_result`.
   */
  public data object SearchResult : InlineV1InvoicesSearchGetResponse200JsonObjectValueX5ff404be() {
    public override val `value`: String = "search_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesSearchGetResponse200JsonObjectValueX5ff404be()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesSearchGetResponse200JsonObjectValueX5ff404be = when (value) {
      SearchResult.value -> SearchResult
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesSearchGetResponse200JsonObjectValueX5ff404be> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesSearchGetResponse200JsonObjectValueX5ff404be", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesSearchGetResponse200JsonObjectValueX5ff404be = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesSearchGetResponse200JsonObjectValueX5ff404be) {
      encoder.encodeString(value.value)
    }
  }
}
