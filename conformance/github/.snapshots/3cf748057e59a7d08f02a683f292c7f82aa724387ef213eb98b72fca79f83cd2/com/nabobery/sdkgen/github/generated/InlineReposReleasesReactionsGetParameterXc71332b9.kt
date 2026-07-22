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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1releases~1{release_id}~1reactions/get/parameters/3/sche
 * ma.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1releases~1{release_id}~1reactions/get/parameters/3/sche
 * ma
 */
@Serializable(with = InlineReposReleasesReactionsGetParameterXc71332b9.Serializer::class)
public sealed class InlineReposReleasesReactionsGetParameterXc71332b9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `+1`.
   */
  public data object _1 : InlineReposReleasesReactionsGetParameterXc71332b9() {
    public override val `value`: String = "+1"
  }

  /**
   * Documented value. Wire value: `laugh`.
   */
  public data object Laugh : InlineReposReleasesReactionsGetParameterXc71332b9() {
    public override val `value`: String = "laugh"
  }

  /**
   * Documented value. Wire value: `heart`.
   */
  public data object Heart : InlineReposReleasesReactionsGetParameterXc71332b9() {
    public override val `value`: String = "heart"
  }

  /**
   * Documented value. Wire value: `hooray`.
   */
  public data object Hooray : InlineReposReleasesReactionsGetParameterXc71332b9() {
    public override val `value`: String = "hooray"
  }

  /**
   * Documented value. Wire value: `rocket`.
   */
  public data object Rocket : InlineReposReleasesReactionsGetParameterXc71332b9() {
    public override val `value`: String = "rocket"
  }

  /**
   * Documented value. Wire value: `eyes`.
   */
  public data object Eyes : InlineReposReleasesReactionsGetParameterXc71332b9() {
    public override val `value`: String = "eyes"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposReleasesReactionsGetParameterXc71332b9()

  public companion object {
    public fun fromValue(`value`: String): InlineReposReleasesReactionsGetParameterXc71332b9 = when (value) {
      _1.value -> _1
      Laugh.value -> Laugh
      Heart.value -> Heart
      Hooray.value -> Hooray
      Rocket.value -> Rocket
      Eyes.value -> Eyes
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReposReleasesReactionsGetParameterXc71332b9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposReleasesReactionsGetParameterXc71332b9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposReleasesReactionsGetParameterXc71332b9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposReleasesReactionsGetParameterXc71332b9) {
      encoder.encodeString(value.value)
    }
  }
}
