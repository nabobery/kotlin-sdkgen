package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/LocalShellCallItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/LocalShellCallItem/properties/type
 */
@Serializable(with = InlineLocalShellCallItemTypeX8c954f03.Serializer::class)
public sealed class InlineLocalShellCallItemTypeX8c954f03 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `local_shell_call`.
   */
  public data object LocalShellCall : InlineLocalShellCallItemTypeX8c954f03() {
    public override val `value`: String = "local_shell_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineLocalShellCallItemTypeX8c954f03()

  public companion object {
    public fun fromValue(`value`: String): InlineLocalShellCallItemTypeX8c954f03 = when (value) {
      LocalShellCall.value -> LocalShellCall
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineLocalShellCallItemTypeX8c954f03> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineLocalShellCallItemTypeX8c954f03", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineLocalShellCallItemTypeX8c954f03 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineLocalShellCallItemTypeX8c954f03) {
      encoder.encodeString(value.value)
    }
  }
}
