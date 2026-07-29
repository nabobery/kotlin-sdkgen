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
 * sdkgen://source/openapi.yaml#/components/schemas/organization-programmatic-access-grant-request/properties/repository
 * _selection
 */
@Serializable(with = InlineOrganizationProgrammaticAccessGrantRequestRepositorySelectionX638a627d.Serializer::class)
public sealed class InlineOrganizationProgrammaticAccessGrantRequestRepositorySelectionX638a627d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineOrganizationProgrammaticAccessGrantRequestRepositorySelectionX638a627d() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrganizationProgrammaticAccessGrantRequestRepositorySelectionX638a627d() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `subset`.
   */
  public data object Subset : InlineOrganizationProgrammaticAccessGrantRequestRepositorySelectionX638a627d() {
    public override val `value`: String = "subset"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationProgrammaticAccessGrantRequestRepositorySelectionX638a627d()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationProgrammaticAccessGrantRequestRepositorySelectionX638a627d = when (value) {
      None.value -> None
      All.value -> All
      Subset.value -> Subset
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrganizationProgrammaticAccessGrantRequestRepositorySelectionX638a627d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrganizationProgrammaticAccessGrantRequestRepositorySelectionX638a627d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationProgrammaticAccessGrantRequestRepositorySelectionX638a627d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationProgrammaticAccessGrantRequestRepositorySelectionX638a627d) {
      encoder.encodeString(value.value)
    }
  }
}
