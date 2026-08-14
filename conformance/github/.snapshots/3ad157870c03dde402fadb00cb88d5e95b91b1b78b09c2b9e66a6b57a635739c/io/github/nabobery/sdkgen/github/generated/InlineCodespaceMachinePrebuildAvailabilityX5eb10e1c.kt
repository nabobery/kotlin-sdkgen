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
 * Whether a prebuild is currently available when creating a codespace for this machine and repository. If a branch was
 * not specified as a ref, the default branch will be assumed. Value will be "null" if prebuilds are not supported or
 * prebuild availability could not be determined. Value will be "none" if no prebuild is available. Latest values
 * "ready" and "in_progress" indicate the prebuild availability status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/codespace-machine/properties/prebuild_availability
 */
@Serializable(with = InlineCodespaceMachinePrebuildAvailabilityX5eb10e1c.Serializer::class)
public sealed class InlineCodespaceMachinePrebuildAvailabilityX5eb10e1c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineCodespaceMachinePrebuildAvailabilityX5eb10e1c() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `ready`.
   */
  public data object Ready : InlineCodespaceMachinePrebuildAvailabilityX5eb10e1c() {
    public override val `value`: String = "ready"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineCodespaceMachinePrebuildAvailabilityX5eb10e1c() {
    public override val `value`: String = "in_progress"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodespaceMachinePrebuildAvailabilityX5eb10e1c()

  public companion object {
    public fun fromValue(`value`: String): InlineCodespaceMachinePrebuildAvailabilityX5eb10e1c = when (value) {
      None.value -> None
      Ready.value -> Ready
      InProgress.value -> InProgress
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodespaceMachinePrebuildAvailabilityX5eb10e1c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCodespaceMachinePrebuildAvailabilityX5eb10e1c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodespaceMachinePrebuildAvailabilityX5eb10e1c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodespaceMachinePrebuildAvailabilityX5eb10e1c) {
      encoder.encodeString(value.value)
    }
  }
}
