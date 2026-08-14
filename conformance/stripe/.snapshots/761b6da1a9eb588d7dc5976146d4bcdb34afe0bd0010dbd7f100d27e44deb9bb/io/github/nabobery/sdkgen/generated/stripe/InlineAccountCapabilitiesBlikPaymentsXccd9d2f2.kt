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
 * The status of the blik payments capability of the account, or whether the account can directly process blik charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/blik_payments
 */
@Serializable(with = InlineAccountCapabilitiesBlikPaymentsXccd9d2f2.Serializer::class)
public sealed class InlineAccountCapabilitiesBlikPaymentsXccd9d2f2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesBlikPaymentsXccd9d2f2() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesBlikPaymentsXccd9d2f2() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesBlikPaymentsXccd9d2f2() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesBlikPaymentsXccd9d2f2()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesBlikPaymentsXccd9d2f2 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesBlikPaymentsXccd9d2f2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesBlikPaymentsXccd9d2f2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesBlikPaymentsXccd9d2f2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesBlikPaymentsXccd9d2f2) {
      encoder.encodeString(value.value)
    }
  }
}
