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
 * Describe whether all repositories have been selected or there's a selection involved
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/installation/properties/repository_selection
 */
@Serializable(with = InlineInstallationRepositorySelectionXd86c6986.Serializer::class)
public sealed class InlineInstallationRepositorySelectionXd86c6986 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineInstallationRepositorySelectionXd86c6986() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineInstallationRepositorySelectionXd86c6986() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInstallationRepositorySelectionXd86c6986()

  public companion object {
    public fun fromValue(`value`: String): InlineInstallationRepositorySelectionXd86c6986 = when (value) {
      All.value -> All
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInstallationRepositorySelectionXd86c6986> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineInstallationRepositorySelectionXd86c6986", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInstallationRepositorySelectionXd86c6986 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInstallationRepositorySelectionXd86c6986) {
      encoder.encodeString(value.value)
    }
  }
}
