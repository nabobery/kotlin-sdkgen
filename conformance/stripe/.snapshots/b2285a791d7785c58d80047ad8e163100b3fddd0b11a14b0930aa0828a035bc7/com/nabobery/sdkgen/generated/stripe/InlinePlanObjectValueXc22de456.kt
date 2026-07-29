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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/plan/properties/object
 */
@Serializable(with = InlinePlanObjectValueXc22de456.Serializer::class)
public sealed class InlinePlanObjectValueXc22de456 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `plan`.
   */
  public data object Plan : InlinePlanObjectValueXc22de456() {
    public override val `value`: String = "plan"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePlanObjectValueXc22de456()

  public companion object {
    public fun fromValue(`value`: String): InlinePlanObjectValueXc22de456 = when (value) {
      Plan.value -> Plan
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePlanObjectValueXc22de456> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePlanObjectValueXc22de456", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePlanObjectValueXc22de456 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePlanObjectValueXc22de456) {
      encoder.encodeString(value.value)
    }
  }
}
