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
 * The policy for which repositories can use Copilot cloud agent. Can be one of `all`, `selected`, or `none`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1coding-agent~1permissions/put/requestBody/content/applica
 * tion~1json/schema/properties/enabled_repositories
 */
@Serializable(with = InlineOrgsCopilotCodingAge731aPutRequestJsonEnabledRepositoriesXe4a1ef0c.Serializer::class)
public sealed class InlineOrgsCopilotCodingAge731aPutRequestJsonEnabledRepositoriesXe4a1ef0c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsCopilotCodingAge731aPutRequestJsonEnabledRepositoriesXe4a1ef0c() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineOrgsCopilotCodingAge731aPutRequestJsonEnabledRepositoriesXe4a1ef0c() {
    public override val `value`: String = "selected"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineOrgsCopilotCodingAge731aPutRequestJsonEnabledRepositoriesXe4a1ef0c() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCopilotCodingAge731aPutRequestJsonEnabledRepositoriesXe4a1ef0c()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCopilotCodingAge731aPutRequestJsonEnabledRepositoriesXe4a1ef0c = when (value) {
      All.value -> All
      Selected.value -> Selected
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsCopilotCodingAge731aPutRequestJsonEnabledRepositoriesXe4a1ef0c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCopilotCodingAge731aPutRequestJsonEnabledRepositoriesXe4a1ef0c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotCodingAge731aPutRequestJsonEnabledRepositoriesXe4a1ef0c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotCodingAge731aPutRequestJsonEnabledRepositoriesXe4a1ef0c) {
      encoder.encodeString(value.value)
    }
  }
}
