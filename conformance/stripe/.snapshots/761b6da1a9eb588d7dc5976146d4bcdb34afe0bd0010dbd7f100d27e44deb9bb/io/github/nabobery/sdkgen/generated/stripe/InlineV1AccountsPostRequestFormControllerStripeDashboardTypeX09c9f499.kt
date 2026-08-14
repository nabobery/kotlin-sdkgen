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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/controller/properties/stripe_dashboard/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/controller/properties/stripe_dashboard/properties/type
 */
@Serializable(with = InlineV1AccountsPostRequestFormControllerStripeDashboardTypeX09c9f499.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormControllerStripeDashboardTypeX09c9f499 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `express`.
   */
  public data object Express : InlineV1AccountsPostRequestFormControllerStripeDashboardTypeX09c9f499() {
    public override val `value`: String = "express"
  }

  /**
   * Documented value. Wire value: `full`.
   */
  public data object Full : InlineV1AccountsPostRequestFormControllerStripeDashboardTypeX09c9f499() {
    public override val `value`: String = "full"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1AccountsPostRequestFormControllerStripeDashboardTypeX09c9f499() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPostRequestFormControllerStripeDashboardTypeX09c9f499()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormControllerStripeDashboardTypeX09c9f499 = when (value) {
      Express.value -> Express
      Full.value -> Full
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormControllerStripeDashboardTypeX09c9f499> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormControllerStripeDashboardTypeX09c9f499", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormControllerStripeDashboardTypeX09c9f499 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormControllerStripeDashboardTypeX09c9f499) {
      encoder.encodeString(value.value)
    }
  }
}
