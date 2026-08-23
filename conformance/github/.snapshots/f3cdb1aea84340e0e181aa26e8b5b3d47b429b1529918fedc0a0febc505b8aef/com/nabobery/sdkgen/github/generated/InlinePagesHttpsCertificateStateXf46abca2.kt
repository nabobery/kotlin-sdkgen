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
 * sdkgen://source/openapi.yaml#/components/schemas/pages-https-certificate/properties/state.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pages-https-certificate/properties/state
 */
@Serializable(with = InlinePagesHttpsCertificateStateXf46abca2.Serializer::class)
public sealed class InlinePagesHttpsCertificateStateXf46abca2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `new`.
   */
  public data object New : InlinePagesHttpsCertificateStateXf46abca2() {
    public override val `value`: String = "new"
  }

  /**
   * Documented value. Wire value: `authorization_created`.
   */
  public data object AuthorizationCreated : InlinePagesHttpsCertificateStateXf46abca2() {
    public override val `value`: String = "authorization_created"
  }

  /**
   * Documented value. Wire value: `authorization_pending`.
   */
  public data object AuthorizationPending : InlinePagesHttpsCertificateStateXf46abca2() {
    public override val `value`: String = "authorization_pending"
  }

  /**
   * Documented value. Wire value: `authorized`.
   */
  public data object Authorized : InlinePagesHttpsCertificateStateXf46abca2() {
    public override val `value`: String = "authorized"
  }

  /**
   * Documented value. Wire value: `authorization_revoked`.
   */
  public data object AuthorizationRevoked : InlinePagesHttpsCertificateStateXf46abca2() {
    public override val `value`: String = "authorization_revoked"
  }

  /**
   * Documented value. Wire value: `issued`.
   */
  public data object Issued : InlinePagesHttpsCertificateStateXf46abca2() {
    public override val `value`: String = "issued"
  }

  /**
   * Documented value. Wire value: `uploaded`.
   */
  public data object Uploaded : InlinePagesHttpsCertificateStateXf46abca2() {
    public override val `value`: String = "uploaded"
  }

  /**
   * Documented value. Wire value: `approved`.
   */
  public data object Approved : InlinePagesHttpsCertificateStateXf46abca2() {
    public override val `value`: String = "approved"
  }

  /**
   * Documented value. Wire value: `errored`.
   */
  public data object Errored : InlinePagesHttpsCertificateStateXf46abca2() {
    public override val `value`: String = "errored"
  }

  /**
   * Documented value. Wire value: `bad_authz`.
   */
  public data object BadAuthz : InlinePagesHttpsCertificateStateXf46abca2() {
    public override val `value`: String = "bad_authz"
  }

  /**
   * Documented value. Wire value: `destroy_pending`.
   */
  public data object DestroyPending : InlinePagesHttpsCertificateStateXf46abca2() {
    public override val `value`: String = "destroy_pending"
  }

  /**
   * Documented value. Wire value: `dns_changed`.
   */
  public data object DnsChanged : InlinePagesHttpsCertificateStateXf46abca2() {
    public override val `value`: String = "dns_changed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePagesHttpsCertificateStateXf46abca2()

  public companion object {
    public fun fromValue(`value`: String): InlinePagesHttpsCertificateStateXf46abca2 = when (value) {
      New.value -> New
      AuthorizationCreated.value -> AuthorizationCreated
      AuthorizationPending.value -> AuthorizationPending
      Authorized.value -> Authorized
      AuthorizationRevoked.value -> AuthorizationRevoked
      Issued.value -> Issued
      Uploaded.value -> Uploaded
      Approved.value -> Approved
      Errored.value -> Errored
      BadAuthz.value -> BadAuthz
      DestroyPending.value -> DestroyPending
      DnsChanged.value -> DnsChanged
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePagesHttpsCertificateStateXf46abca2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlinePagesHttpsCertificateStateXf46abca2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePagesHttpsCertificateStateXf46abca2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePagesHttpsCertificateStateXf46abca2) {
      encoder.encodeString(value.value)
    }
  }
}
