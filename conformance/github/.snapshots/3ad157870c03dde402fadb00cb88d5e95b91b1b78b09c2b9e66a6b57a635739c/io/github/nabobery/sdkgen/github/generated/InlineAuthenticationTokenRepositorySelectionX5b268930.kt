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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/authentication-token/properties/repository_selection
 */
@Serializable(with = InlineAuthenticationTokenRepositorySelectionX5b268930.Serializer::class)
public sealed class InlineAuthenticationTokenRepositorySelectionX5b268930 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineAuthenticationTokenRepositorySelectionX5b268930() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineAuthenticationTokenRepositorySelectionX5b268930() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAuthenticationTokenRepositorySelectionX5b268930()

  public companion object {
    public fun fromValue(`value`: String): InlineAuthenticationTokenRepositorySelectionX5b268930 = when (value) {
      All.value -> All
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAuthenticationTokenRepositorySelectionX5b268930> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAuthenticationTokenRepositorySelectionX5b268930", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAuthenticationTokenRepositorySelectionX5b268930 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAuthenticationTokenRepositorySelectionX5b268930) {
      encoder.encodeString(value.value)
    }
  }
}
