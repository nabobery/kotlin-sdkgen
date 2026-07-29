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
 * The state of the milestone. Either `open` or `closed`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1milestones~1{milestone_number}/patch/requestBody/conten
 * t/application~1json/schema/properties/state
 */
@Serializable(with = InlineReposMilestonesPatchRequestJsonStateX305f19b5.Serializer::class)
public sealed class InlineReposMilestonesPatchRequestJsonStateX305f19b5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineReposMilestonesPatchRequestJsonStateX305f19b5() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineReposMilestonesPatchRequestJsonStateX305f19b5() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposMilestonesPatchRequestJsonStateX305f19b5()

  public companion object {
    public fun fromValue(`value`: String): InlineReposMilestonesPatchRequestJsonStateX305f19b5 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReposMilestonesPatchRequestJsonStateX305f19b5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposMilestonesPatchRequestJsonStateX305f19b5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposMilestonesPatchRequestJsonStateX305f19b5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposMilestonesPatchRequestJsonStateX305f19b5) {
      encoder.encodeString(value.value)
    }
  }
}
