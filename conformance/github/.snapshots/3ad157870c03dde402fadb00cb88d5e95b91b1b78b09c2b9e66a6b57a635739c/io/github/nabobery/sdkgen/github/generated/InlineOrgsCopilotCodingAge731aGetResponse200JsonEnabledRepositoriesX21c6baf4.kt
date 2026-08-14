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
 * The policy for which repositories can use Copilot cloud agent. Can be one of `all`, `selected`, or `none`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1coding-agent~1permissions/get/responses/200/content/appli
 * cation~1json/schema/properties/enabled_repositories
 */
@Serializable(with = InlineOrgsCopilotCodingAge731aGetResponse200JsonEnabledRepositoriesX21c6baf4.Serializer::class)
public sealed class InlineOrgsCopilotCodingAge731aGetResponse200JsonEnabledRepositoriesX21c6baf4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsCopilotCodingAge731aGetResponse200JsonEnabledRepositoriesX21c6baf4() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineOrgsCopilotCodingAge731aGetResponse200JsonEnabledRepositoriesX21c6baf4() {
    public override val `value`: String = "selected"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineOrgsCopilotCodingAge731aGetResponse200JsonEnabledRepositoriesX21c6baf4() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCopilotCodingAge731aGetResponse200JsonEnabledRepositoriesX21c6baf4()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCopilotCodingAge731aGetResponse200JsonEnabledRepositoriesX21c6baf4 = when (value) {
      All.value -> All
      Selected.value -> Selected
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotCodingAge731aGetResponse200JsonEnabledRepositoriesX21c6baf4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsCopilotCodingAge731aGetResponse200JsonEnabledRepositoriesX21c6baf4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotCodingAge731aGetResponse200JsonEnabledRepositoriesX21c6baf4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotCodingAge731aGetResponse200JsonEnabledRepositoriesX21c6baf4) {
      encoder.encodeString(value.value)
    }
  }
}
