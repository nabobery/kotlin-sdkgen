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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/installation-token/properties/repository_selection.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/installation-token/properties/repository_selection
 */
@Serializable(with = InlineInstallationTokenRepositorySelectionX74063bc7.Serializer::class)
public sealed class InlineInstallationTokenRepositorySelectionX74063bc7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineInstallationTokenRepositorySelectionX74063bc7() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineInstallationTokenRepositorySelectionX74063bc7() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInstallationTokenRepositorySelectionX74063bc7()

  public companion object {
    public fun fromValue(`value`: String): InlineInstallationTokenRepositorySelectionX74063bc7 = when (value) {
      All.value -> All
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineInstallationTokenRepositorySelectionX74063bc7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineInstallationTokenRepositorySelectionX74063bc7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInstallationTokenRepositorySelectionX74063bc7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInstallationTokenRepositorySelectionX74063bc7) {
      encoder.encodeString(value.value)
    }
  }
}
