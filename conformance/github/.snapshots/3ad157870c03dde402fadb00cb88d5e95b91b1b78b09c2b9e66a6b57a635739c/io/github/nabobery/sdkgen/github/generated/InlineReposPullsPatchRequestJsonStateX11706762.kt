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
 * State of this Pull Request. Either `open` or `closed`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}/patch/requestBody/content/applicat
 * ion~1json/schema/properties/state
 */
@Serializable(with = InlineReposPullsPatchRequestJsonStateX11706762.Serializer::class)
public sealed class InlineReposPullsPatchRequestJsonStateX11706762 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineReposPullsPatchRequestJsonStateX11706762() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineReposPullsPatchRequestJsonStateX11706762() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPullsPatchRequestJsonStateX11706762()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPullsPatchRequestJsonStateX11706762 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposPullsPatchRequestJsonStateX11706762> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposPullsPatchRequestJsonStateX11706762", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPullsPatchRequestJsonStateX11706762 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsPatchRequestJsonStateX11706762) {
      encoder.encodeString(value.value)
    }
  }
}
