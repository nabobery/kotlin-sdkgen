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
 * sdkgen://source/openapi.json#/paths/~1v1~1link_account_sessions/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/permissions/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1link_account_sessions/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/permissions/items
 */
@Serializable(with = InlineV1LinkAccountSessionsPostRequestFormPermissionsItemX0bf81dae.Serializer::class)
public sealed class InlineV1LinkAccountSessionsPostRequestFormPermissionsItemX0bf81dae {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `balances`.
   */
  public data object Balances : InlineV1LinkAccountSessionsPostRequestFormPermissionsItemX0bf81dae() {
    public override val `value`: String = "balances"
  }

  /**
   * Documented value. Wire value: `ownership`.
   */
  public data object Ownership : InlineV1LinkAccountSessionsPostRequestFormPermissionsItemX0bf81dae() {
    public override val `value`: String = "ownership"
  }

  /**
   * Documented value. Wire value: `payment_method`.
   */
  public data object PaymentMethod : InlineV1LinkAccountSessionsPostRequestFormPermissionsItemX0bf81dae() {
    public override val `value`: String = "payment_method"
  }

  /**
   * Documented value. Wire value: `transactions`.
   */
  public data object Transactions : InlineV1LinkAccountSessionsPostRequestFormPermissionsItemX0bf81dae() {
    public override val `value`: String = "transactions"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1LinkAccountSessionsPostRequestFormPermissionsItemX0bf81dae()

  public companion object {
    public fun fromValue(`value`: String): InlineV1LinkAccountSessionsPostRequestFormPermissionsItemX0bf81dae = when (value) {
      Balances.value -> Balances
      Ownership.value -> Ownership
      PaymentMethod.value -> PaymentMethod
      Transactions.value -> Transactions
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1LinkAccountSessionsPostRequestFormPermissionsItemX0bf81dae> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1LinkAccountSessionsPostRequestFormPermissionsItemX0bf81dae", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1LinkAccountSessionsPostRequestFormPermissionsItemX0bf81dae = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1LinkAccountSessionsPostRequestFormPermissionsItemX0bf81dae) {
      encoder.encodeString(value.value)
    }
  }
}
