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
 * The state of the Dependabot alert.
 * A `dismissed_reason` must be provided when setting the state to `dismissed`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1dependabot~1alerts~1{alert_number}/patch/requestBody/co
 * ntent/application~1json/schema/properties/state
 */
@Serializable(with = InlineReposDependabotAlertsPatchRequestJsonStateX0318b362.Serializer::class)
public sealed class InlineReposDependabotAlertsPatchRequestJsonStateX0318b362 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `dismissed`.
   */
  public data object Dismissed : InlineReposDependabotAlertsPatchRequestJsonStateX0318b362() {
    public override val `value`: String = "dismissed"
  }

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineReposDependabotAlertsPatchRequestJsonStateX0318b362() {
    public override val `value`: String = "open"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposDependabotAlertsPatchRequestJsonStateX0318b362()

  public companion object {
    public fun fromValue(`value`: String): InlineReposDependabotAlertsPatchRequestJsonStateX0318b362 = when (value) {
      Dismissed.value -> Dismissed
      Open.value -> Open
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposDependabotAlertsPatchRequestJsonStateX0318b362> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposDependabotAlertsPatchRequestJsonStateX0318b362", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposDependabotAlertsPatchRequestJsonStateX0318b362 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposDependabotAlertsPatchRequestJsonStateX0318b362) {
      encoder.encodeString(value.value)
    }
  }
}
