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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/api-insights-actor-type/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/api-insights-actor-type/schema
 */
@Serializable(with = InlineApiInsightsActorTypeParameterX1e6f6f3f.Serializer::class)
public sealed class InlineApiInsightsActorTypeParameterX1e6f6f3f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `installation`.
   */
  public data object Installation : InlineApiInsightsActorTypeParameterX1e6f6f3f() {
    public override val `value`: String = "installation"
  }

  /**
   * Documented value. Wire value: `classic_pat`.
   */
  public data object ClassicPat : InlineApiInsightsActorTypeParameterX1e6f6f3f() {
    public override val `value`: String = "classic_pat"
  }

  /**
   * Documented value. Wire value: `fine_grained_pat`.
   */
  public data object FineGrainedPat : InlineApiInsightsActorTypeParameterX1e6f6f3f() {
    public override val `value`: String = "fine_grained_pat"
  }

  /**
   * Documented value. Wire value: `oauth_app`.
   */
  public data object OauthApp : InlineApiInsightsActorTypeParameterX1e6f6f3f() {
    public override val `value`: String = "oauth_app"
  }

  /**
   * Documented value. Wire value: `github_app_user_to_server`.
   */
  public data object GithubAppUserToServer : InlineApiInsightsActorTypeParameterX1e6f6f3f() {
    public override val `value`: String = "github_app_user_to_server"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineApiInsightsActorTypeParameterX1e6f6f3f()

  public companion object {
    public fun fromValue(`value`: String): InlineApiInsightsActorTypeParameterX1e6f6f3f = when (value) {
      Installation.value -> Installation
      ClassicPat.value -> ClassicPat
      FineGrainedPat.value -> FineGrainedPat
      OauthApp.value -> OauthApp
      GithubAppUserToServer.value -> GithubAppUserToServer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineApiInsightsActorTypeParameterX1e6f6f3f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineApiInsightsActorTypeParameterX1e6f6f3f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineApiInsightsActorTypeParameterX1e6f6f3f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineApiInsightsActorTypeParameterX1e6f6f3f) {
      encoder.encodeString(value.value)
    }
  }
}
