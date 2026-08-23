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
 * Type of repository selection requested.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/organization-programmatic-access-grant/properties/repository_selecti
 * on
 */
@Serializable(with = InlineOrganizationProgrammaticAccessGrantRepositorySelectionX83acc941.Serializer::class)
public sealed class InlineOrganizationProgrammaticAccessGrantRepositorySelectionX83acc941 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineOrganizationProgrammaticAccessGrantRepositorySelectionX83acc941() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrganizationProgrammaticAccessGrantRepositorySelectionX83acc941() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `subset`.
   */
  public data object Subset : InlineOrganizationProgrammaticAccessGrantRepositorySelectionX83acc941() {
    public override val `value`: String = "subset"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationProgrammaticAccessGrantRepositorySelectionX83acc941()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationProgrammaticAccessGrantRepositorySelectionX83acc941 = when (value) {
      None.value -> None
      All.value -> All
      Subset.value -> Subset
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrganizationProgrammaticAccessGrantRepositorySelectionX83acc941> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrganizationProgrammaticAccessGrantRepositorySelectionX83acc941", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationProgrammaticAccessGrantRepositorySelectionX83acc941 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationProgrammaticAccessGrantRepositorySelectionX83acc941) {
      encoder.encodeString(value.value)
    }
  }
}
