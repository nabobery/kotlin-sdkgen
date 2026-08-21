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
 * The policy that controls whether self-hosted runners can be used by repositories in the organization
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/self-hosted-runners-settings/properties/enabled_repositories
 */
@Serializable(with = InlineSelfHostedRunnersSettingsEnabledRepositoriesX99d426d6.Serializer::class)
public sealed class InlineSelfHostedRunnersSettingsEnabledRepositoriesX99d426d6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineSelfHostedRunnersSettingsEnabledRepositoriesX99d426d6() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineSelfHostedRunnersSettingsEnabledRepositoriesX99d426d6() {
    public override val `value`: String = "selected"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineSelfHostedRunnersSettingsEnabledRepositoriesX99d426d6() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSelfHostedRunnersSettingsEnabledRepositoriesX99d426d6()

  public companion object {
    public fun fromValue(`value`: String): InlineSelfHostedRunnersSettingsEnabledRepositoriesX99d426d6 = when (value) {
      All.value -> All
      Selected.value -> Selected
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSelfHostedRunnersSettingsEnabledRepositoriesX99d426d6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSelfHostedRunnersSettingsEnabledRepositoriesX99d426d6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSelfHostedRunnersSettingsEnabledRepositoriesX99d426d6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSelfHostedRunnersSettingsEnabledRepositoriesX99d426d6) {
      encoder.encodeString(value.value)
    }
  }
}
