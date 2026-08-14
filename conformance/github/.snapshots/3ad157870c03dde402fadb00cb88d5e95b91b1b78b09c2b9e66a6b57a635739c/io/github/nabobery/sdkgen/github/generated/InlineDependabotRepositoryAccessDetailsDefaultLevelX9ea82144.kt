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
 * The default repository access level for Dependabot updates.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/dependabot-repository-access-details/properties/default_level
 */
@Serializable(with = InlineDependabotRepositoryAccessDetailsDefaultLevelX9ea82144.Serializer::class)
public sealed class InlineDependabotRepositoryAccessDetailsDefaultLevelX9ea82144 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineDependabotRepositoryAccessDetailsDefaultLevelX9ea82144() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineDependabotRepositoryAccessDetailsDefaultLevelX9ea82144() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDependabotRepositoryAccessDetailsDefaultLevelX9ea82144()

  public companion object {
    public fun fromValue(`value`: String): InlineDependabotRepositoryAccessDetailsDefaultLevelX9ea82144 = when (value) {
      Public.value -> Public
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDependabotRepositoryAccessDetailsDefaultLevelX9ea82144> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineDependabotRepositoryAccessDetailsDefaultLevelX9ea82144", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDependabotRepositoryAccessDetailsDefaultLevelX9ea82144 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDependabotRepositoryAccessDetailsDefaultLevelX9ea82144) {
      encoder.encodeString(value.value)
    }
  }
}
