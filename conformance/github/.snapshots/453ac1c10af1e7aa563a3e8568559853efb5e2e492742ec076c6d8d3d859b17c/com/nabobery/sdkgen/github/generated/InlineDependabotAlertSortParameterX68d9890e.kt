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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/dependabot-alert-sort/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/dependabot-alert-sort/schema
 */
@Serializable(with = InlineDependabotAlertSortParameterX68d9890e.Serializer::class)
public sealed class InlineDependabotAlertSortParameterX68d9890e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineDependabotAlertSortParameterX68d9890e() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineDependabotAlertSortParameterX68d9890e() {
    public override val `value`: String = "updated"
  }

  /**
   * Documented value. Wire value: `epss_percentage`.
   */
  public data object EpssPercentage : InlineDependabotAlertSortParameterX68d9890e() {
    public override val `value`: String = "epss_percentage"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDependabotAlertSortParameterX68d9890e()

  public companion object {
    public fun fromValue(`value`: String): InlineDependabotAlertSortParameterX68d9890e = when (value) {
      Created.value -> Created
      Updated.value -> Updated
      EpssPercentage.value -> EpssPercentage
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineDependabotAlertSortParameterX68d9890e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineDependabotAlertSortParameterX68d9890e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDependabotAlertSortParameterX68d9890e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDependabotAlertSortParameterX68d9890e) {
      encoder.encodeString(value.value)
    }
  }
}
