package io.github.nabobery.sdkgen.generated.stripe

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
 * oded/schema/properties/settings/properties/card_issuing/properties/tos_acceptance/properties/user_agent/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/card_issuing/properties/tos_acceptance/properties/user_agent/anyOf/1
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2Xbe44a8a7.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2Xbe44a8a7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2Xbe44a8a7() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2Xbe44a8a7()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2Xbe44a8a7 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2Xbe44a8a7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2Xbe44a8a7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2Xbe44a8a7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceAnyOf2Xbe44a8a7) {
      encoder.encodeString(value.value)
    }
  }
}
