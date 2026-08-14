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
 * A value indicating responsibility for collecting requirements on this account. Only returned when the Connect
 * application retrieving the resource controls the account.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/account_unification_account_controller/properties/requirement_collec
 * tion
 */
@Serializable(with = InlineAccountUnificationAccountControllerRequirementCollectionX2d9f4777.Serializer::class)
public sealed class InlineAccountUnificationAccountControllerRequirementCollectionX2d9f4777 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `application`.
   */
  public data object Application : InlineAccountUnificationAccountControllerRequirementCollectionX2d9f4777() {
    public override val `value`: String = "application"
  }

  /**
   * Documented value. Wire value: `stripe`.
   */
  public data object Stripe : InlineAccountUnificationAccountControllerRequirementCollectionX2d9f4777() {
    public override val `value`: String = "stripe"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountUnificationAccountControllerRequirementCollectionX2d9f4777()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountUnificationAccountControllerRequirementCollectionX2d9f4777 = when (value) {
      Application.value -> Application
      Stripe.value -> Stripe
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountUnificationAccountControllerRequirementCollectionX2d9f4777> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineAccountUnificationAccountControllerRequirementCollectionX2d9f4777", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountUnificationAccountControllerRequirementCollectionX2d9f4777 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountUnificationAccountControllerRequirementCollectionX2d9f4777) {
      encoder.encodeString(value.value)
    }
  }
}
