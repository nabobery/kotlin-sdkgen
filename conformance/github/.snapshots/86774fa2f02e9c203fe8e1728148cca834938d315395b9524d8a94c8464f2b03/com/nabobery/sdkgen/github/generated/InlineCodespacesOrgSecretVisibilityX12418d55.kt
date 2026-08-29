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
 * The type of repositories in the organization that the secret is visible to
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/codespaces-org-secret/properties/visibility
 */
@Serializable(with = InlineCodespacesOrgSecretVisibilityX12418d55.Serializer::class)
public sealed class InlineCodespacesOrgSecretVisibilityX12418d55 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineCodespacesOrgSecretVisibilityX12418d55() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineCodespacesOrgSecretVisibilityX12418d55() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineCodespacesOrgSecretVisibilityX12418d55() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodespacesOrgSecretVisibilityX12418d55()

  public companion object {
    public fun fromValue(`value`: String): InlineCodespacesOrgSecretVisibilityX12418d55 = when (value) {
      All.value -> All
      Private.value -> Private
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodespacesOrgSecretVisibilityX12418d55> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodespacesOrgSecretVisibilityX12418d55", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodespacesOrgSecretVisibilityX12418d55 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodespacesOrgSecretVisibilityX12418d55) {
      encoder.encodeString(value.value)
    }
  }
}
