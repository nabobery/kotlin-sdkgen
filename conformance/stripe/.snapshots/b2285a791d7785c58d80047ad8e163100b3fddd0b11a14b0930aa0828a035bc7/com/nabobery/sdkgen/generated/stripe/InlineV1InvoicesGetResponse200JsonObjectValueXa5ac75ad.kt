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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/get/responses/200/content/application~1json/schema/properties/obje
 * ct
 */
@Serializable(with = InlineV1InvoicesGetResponse200JsonObjectValueXa5ac75ad.Serializer::class)
public sealed class InlineV1InvoicesGetResponse200JsonObjectValueXa5ac75ad {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1InvoicesGetResponse200JsonObjectValueXa5ac75ad() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesGetResponse200JsonObjectValueXa5ac75ad()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesGetResponse200JsonObjectValueXa5ac75ad = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesGetResponse200JsonObjectValueXa5ac75ad> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesGetResponse200JsonObjectValueXa5ac75ad", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesGetResponse200JsonObjectValueXa5ac75ad = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesGetResponse200JsonObjectValueXa5ac75ad) {
      encoder.encodeString(value.value)
    }
  }
}
