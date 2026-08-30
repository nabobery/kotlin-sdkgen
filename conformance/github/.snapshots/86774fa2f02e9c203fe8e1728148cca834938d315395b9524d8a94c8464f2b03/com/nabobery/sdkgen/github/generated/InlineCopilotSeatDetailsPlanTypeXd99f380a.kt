package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The Copilot plan of the organization, or the parent enterprise, when applicable.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/copilot-seat-details/properties/plan_type
 */
@Serializable(with = InlineCopilotSeatDetailsPlanTypeXd99f380a.Serializer::class)
public sealed class InlineCopilotSeatDetailsPlanTypeXd99f380a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `business`.
   */
  public data object Business : InlineCopilotSeatDetailsPlanTypeXd99f380a() {
    public override val `value`: String = "business"
  }

  /**
   * Documented value. Wire value: `enterprise`.
   */
  public data object Enterprise : InlineCopilotSeatDetailsPlanTypeXd99f380a() {
    public override val `value`: String = "enterprise"
  }

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlineCopilotSeatDetailsPlanTypeXd99f380a() {
    public override val `value`: String = "unknown"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCopilotSeatDetailsPlanTypeXd99f380a()

  public companion object {
    public fun fromValue(`value`: String): InlineCopilotSeatDetailsPlanTypeXd99f380a = when (value) {
      Business.value -> Business
      Enterprise.value -> Enterprise
      Unknown.value -> Unknown
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCopilotSeatDetailsPlanTypeXd99f380a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCopilotSeatDetailsPlanTypeXd99f380a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCopilotSeatDetailsPlanTypeXd99f380a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCopilotSeatDetailsPlanTypeXd99f380a) {
      encoder.encodeString(value.value)
    }
  }
}
