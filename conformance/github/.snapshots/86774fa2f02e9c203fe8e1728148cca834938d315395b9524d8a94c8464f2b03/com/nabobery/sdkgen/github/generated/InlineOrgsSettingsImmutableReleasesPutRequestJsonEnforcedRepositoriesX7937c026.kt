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
 * The policy that controls how immutable releases are enforced in the organization.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1settings~1immutable-releases/put/requestBody/content/application~1
 * json/schema/properties/enforced_repositories
 */
@Serializable(with = InlineOrgsSettingsImmutableReleasesPutRequestJsonEnforcedRepositoriesX7937c026.Serializer::class)
public sealed class InlineOrgsSettingsImmutableReleasesPutRequestJsonEnforcedRepositoriesX7937c026 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsSettingsImmutableReleasesPutRequestJsonEnforcedRepositoriesX7937c026() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineOrgsSettingsImmutableReleasesPutRequestJsonEnforcedRepositoriesX7937c026() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineOrgsSettingsImmutableReleasesPutRequestJsonEnforcedRepositoriesX7937c026() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsSettingsImmutableReleasesPutRequestJsonEnforcedRepositoriesX7937c026()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsSettingsImmutableReleasesPutRequestJsonEnforcedRepositoriesX7937c026 = when (value) {
      All.value -> All
      None.value -> None
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsSettingsImmutableReleasesPutRequestJsonEnforcedRepositoriesX7937c026> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsSettingsImmutableReleasesPutRequestJsonEnforcedRepositoriesX7937c026", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsSettingsImmutableReleasesPutRequestJsonEnforcedRepositoriesX7937c026 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsSettingsImmutableReleasesPutRequestJsonEnforcedRepositoriesX7937c026) {
      encoder.encodeString(value.value)
    }
  }
}
