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
 * The policy that controls whether self-hosted runners can be used in the organization
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1permissions~1self-hosted-runners/put/requestBody/content/
 * application~1json/schema/properties/enabled_repositories
 */
@Serializable(with = InlineOrgsActionsPermissio7a6aPutRequestJsonEnabledRepositoriesX784c77a1.Serializer::class)
public sealed class InlineOrgsActionsPermissio7a6aPutRequestJsonEnabledRepositoriesX784c77a1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsActionsPermissio7a6aPutRequestJsonEnabledRepositoriesX784c77a1() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineOrgsActionsPermissio7a6aPutRequestJsonEnabledRepositoriesX784c77a1() {
    public override val `value`: String = "selected"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineOrgsActionsPermissio7a6aPutRequestJsonEnabledRepositoriesX784c77a1() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsActionsPermissio7a6aPutRequestJsonEnabledRepositoriesX784c77a1()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsActionsPermissio7a6aPutRequestJsonEnabledRepositoriesX784c77a1 = when (value) {
      All.value -> All
      Selected.value -> Selected
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsActionsPermissio7a6aPutRequestJsonEnabledRepositoriesX784c77a1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsActionsPermissio7a6aPutRequestJsonEnabledRepositoriesX784c77a1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsActionsPermissio7a6aPutRequestJsonEnabledRepositoriesX784c77a1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsPermissio7a6aPutRequestJsonEnabledRepositoriesX784c77a1) {
      encoder.encodeString(value.value)
    }
  }
}
