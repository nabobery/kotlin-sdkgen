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
 * Describe whether all repositories have been selected or there's a selection involved
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-scoped-installation/properties/repository_selection
 */
@Serializable(with = InlineNullableScopedInstallationRepositorySelectionX6eb78fa0.Serializer::class)
public sealed class InlineNullableScopedInstallationRepositorySelectionX6eb78fa0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineNullableScopedInstallationRepositorySelectionX6eb78fa0() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineNullableScopedInstallationRepositorySelectionX6eb78fa0() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineNullableScopedInstallationRepositorySelectionX6eb78fa0()

  public companion object {
    public fun fromValue(`value`: String): InlineNullableScopedInstallationRepositorySelectionX6eb78fa0 = when (value) {
      All.value -> All
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineNullableScopedInstallationRepositorySelectionX6eb78fa0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineNullableScopedInstallationRepositorySelectionX6eb78fa0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineNullableScopedInstallationRepositorySelectionX6eb78fa0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineNullableScopedInstallationRepositorySelectionX6eb78fa0) {
      encoder.encodeString(value.value)
    }
  }
}
