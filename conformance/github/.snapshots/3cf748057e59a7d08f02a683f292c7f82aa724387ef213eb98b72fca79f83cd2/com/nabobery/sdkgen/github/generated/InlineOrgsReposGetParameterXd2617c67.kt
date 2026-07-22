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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1repos/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1repos/get/parameters/1/schema
 */
@Serializable(with = InlineOrgsReposGetParameterXd2617c67.Serializer::class)
public sealed class InlineOrgsReposGetParameterXd2617c67 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsReposGetParameterXd2617c67() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineOrgsReposGetParameterXd2617c67() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineOrgsReposGetParameterXd2617c67() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `forks`.
   */
  public data object Forks : InlineOrgsReposGetParameterXd2617c67() {
    public override val `value`: String = "forks"
  }

  /**
   * Documented value. Wire value: `sources`.
   */
  public data object Sources : InlineOrgsReposGetParameterXd2617c67() {
    public override val `value`: String = "sources"
  }

  /**
   * Documented value. Wire value: `member`.
   */
  public data object Member : InlineOrgsReposGetParameterXd2617c67() {
    public override val `value`: String = "member"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsReposGetParameterXd2617c67()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsReposGetParameterXd2617c67 = when (value) {
      All.value -> All
      Public.value -> Public
      Private.value -> Private
      Forks.value -> Forks
      Sources.value -> Sources
      Member.value -> Member
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsReposGetParameterXd2617c67> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsReposGetParameterXd2617c67", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsReposGetParameterXd2617c67 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsReposGetParameterXd2617c67) {
      encoder.encodeString(value.value)
    }
  }
}
