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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/parameters/dependabot-alert-comma-separated-has/schema/oneOf/1/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/dependabot-alert-comma-separated-has/schema/oneOf/1/items
 */
@Serializable(with = InlineDependabotAlertCommaSeparatedHasParameterOneOf2ItemX8937280e.Serializer::class)
public sealed class InlineDependabotAlertCommaSeparatedHasParameterOneOf2ItemX8937280e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `patch`.
   */
  public data object Patch : InlineDependabotAlertCommaSeparatedHasParameterOneOf2ItemX8937280e() {
    public override val `value`: String = "patch"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDependabotAlertCommaSeparatedHasParameterOneOf2ItemX8937280e()

  public companion object {
    public fun fromValue(`value`: String): InlineDependabotAlertCommaSeparatedHasParameterOneOf2ItemX8937280e = when (value) {
      Patch.value -> Patch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDependabotAlertCommaSeparatedHasParameterOneOf2ItemX8937280e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineDependabotAlertCommaSeparatedHasParameterOneOf2ItemX8937280e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDependabotAlertCommaSeparatedHasParameterOneOf2ItemX8937280e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDependabotAlertCommaSeparatedHasParameterOneOf2ItemX8937280e) {
      encoder.encodeString(value.value)
    }
  }
}
