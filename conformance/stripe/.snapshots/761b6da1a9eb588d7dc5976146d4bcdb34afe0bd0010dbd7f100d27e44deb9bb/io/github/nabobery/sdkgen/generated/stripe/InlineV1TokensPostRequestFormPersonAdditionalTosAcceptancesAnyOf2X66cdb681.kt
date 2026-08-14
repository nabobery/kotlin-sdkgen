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
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/additional_tos_acceptances/properties/account/properties/user_agent/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/additional_tos_acceptances/properties/account/properties/user_agent/anyOf/1
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681.Serializer::class)
public sealed class InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAnyOf2X66cdb681) {
      encoder.encodeString(value.value)
    }
  }
}
