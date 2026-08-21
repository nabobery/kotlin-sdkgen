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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/controller/properties/requirement_collection.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/controller/properties/requirement_collection
 */
@Serializable(with = InlineV1AccountsPostRequestFormControllerRequirementCollectionXb0800aa0.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormControllerRequirementCollectionXb0800aa0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `application`.
   */
  public data object Application : InlineV1AccountsPostRequestFormControllerRequirementCollectionXb0800aa0() {
    public override val `value`: String = "application"
  }

  /**
   * Documented value. Wire value: `stripe`.
   */
  public data object Stripe : InlineV1AccountsPostRequestFormControllerRequirementCollectionXb0800aa0() {
    public override val `value`: String = "stripe"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPostRequestFormControllerRequirementCollectionXb0800aa0()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormControllerRequirementCollectionXb0800aa0 = when (value) {
      Application.value -> Application
      Stripe.value -> Stripe
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormControllerRequirementCollectionXb0800aa0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormControllerRequirementCollectionXb0800aa0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormControllerRequirementCollectionXb0800aa0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormControllerRequirementCollectionXb0800aa0) {
      encoder.encodeString(value.value)
    }
  }
}
