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
 * The mandate status indicates whether or not you can use it to initiate a payment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate/properties/status
 */
@Serializable(with = InlineMandateStatusX77cf439c.Serializer::class)
public sealed class InlineMandateStatusX77cf439c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineMandateStatusX77cf439c() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineMandateStatusX77cf439c() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineMandateStatusX77cf439c() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMandateStatusX77cf439c()

  public companion object {
    public fun fromValue(`value`: String): InlineMandateStatusX77cf439c = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMandateStatusX77cf439c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineMandateStatusX77cf439c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMandateStatusX77cf439c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMandateStatusX77cf439c) {
      encoder.encodeString(value.value)
    }
  }
}
