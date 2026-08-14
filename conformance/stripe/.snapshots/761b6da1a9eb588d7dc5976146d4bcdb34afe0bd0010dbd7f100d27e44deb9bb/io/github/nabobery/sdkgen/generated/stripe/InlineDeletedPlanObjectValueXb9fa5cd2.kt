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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_plan/properties/object
 */
@Serializable(with = InlineDeletedPlanObjectValueXb9fa5cd2.Serializer::class)
public sealed class InlineDeletedPlanObjectValueXb9fa5cd2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `plan`.
   */
  public data object Plan : InlineDeletedPlanObjectValueXb9fa5cd2() {
    public override val `value`: String = "plan"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeletedPlanObjectValueXb9fa5cd2()

  public companion object {
    public fun fromValue(`value`: String): InlineDeletedPlanObjectValueXb9fa5cd2 = when (value) {
      Plan.value -> Plan
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDeletedPlanObjectValueXb9fa5cd2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineDeletedPlanObjectValueXb9fa5cd2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeletedPlanObjectValueXb9fa5cd2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeletedPlanObjectValueXb9fa5cd2) {
      encoder.encodeString(value.value)
    }
  }
}
