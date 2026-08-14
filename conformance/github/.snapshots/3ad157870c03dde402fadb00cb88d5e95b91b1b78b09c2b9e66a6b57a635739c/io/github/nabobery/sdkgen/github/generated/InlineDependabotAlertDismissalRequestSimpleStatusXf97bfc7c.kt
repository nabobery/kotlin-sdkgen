package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The current status of the dismissal request.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependabot-alert-dismissal-request-simple/properties/status
 */
@Serializable(with = InlineDependabotAlertDismissalRequestSimpleStatusXf97bfc7c.Serializer::class)
public sealed class InlineDependabotAlertDismissalRequestSimpleStatusXf97bfc7c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineDependabotAlertDismissalRequestSimpleStatusXf97bfc7c() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `approved`.
   */
  public data object Approved : InlineDependabotAlertDismissalRequestSimpleStatusXf97bfc7c() {
    public override val `value`: String = "approved"
  }

  /**
   * Documented value. Wire value: `rejected`.
   */
  public data object Rejected : InlineDependabotAlertDismissalRequestSimpleStatusXf97bfc7c() {
    public override val `value`: String = "rejected"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineDependabotAlertDismissalRequestSimpleStatusXf97bfc7c() {
    public override val `value`: String = "cancelled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDependabotAlertDismissalRequestSimpleStatusXf97bfc7c()

  public companion object {
    public fun fromValue(`value`: String): InlineDependabotAlertDismissalRequestSimpleStatusXf97bfc7c = when (value) {
      Pending.value -> Pending
      Approved.value -> Approved
      Rejected.value -> Rejected
      Cancelled.value -> Cancelled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDependabotAlertDismissalRequestSimpleStatusXf97bfc7c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineDependabotAlertDismissalRequestSimpleStatusXf97bfc7c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDependabotAlertDismissalRequestSimpleStatusXf97bfc7c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDependabotAlertDismissalRequestSimpleStatusXf97bfc7c) {
      encoder.encodeString(value.value)
    }
  }
}
