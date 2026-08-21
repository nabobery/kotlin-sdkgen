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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/additional_tos_acceptances/properties/account/properties/user_agent/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/additional_tos_acceptances/properties/account/properties/user_agent/anyOf/1
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2X7ebce5ff.Serializer::class)
public sealed class InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2X7ebce5ff {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2X7ebce5ff() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2X7ebce5ff()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2X7ebce5ff = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2X7ebce5ff> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2X7ebce5ff", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2X7ebce5ff = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2X7ebce5ff) {
      encoder.encodeString(value.value)
    }
  }
}
