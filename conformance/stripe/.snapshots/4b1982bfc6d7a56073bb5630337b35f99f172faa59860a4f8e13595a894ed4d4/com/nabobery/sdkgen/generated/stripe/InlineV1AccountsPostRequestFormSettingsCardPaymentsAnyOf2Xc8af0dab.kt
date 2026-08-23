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
 * oded/schema/properties/settings/properties/card_payments/properties/statement_descriptor_prefix_kana/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/card_payments/properties/statement_descriptor_prefix_kana/anyOf/1
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsCardPaymentsAnyOf2Xc8af0dab) {
      encoder.encodeString(value.value)
    }
  }
}
