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
 * The type of credit the user is receiving.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/security-advisory-credit-types
 */
@Serializable(with = SecurityAdvisoryCreditTypes.Serializer::class)
public sealed class SecurityAdvisoryCreditTypes {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `analyst`.
   */
  public data object Analyst : SecurityAdvisoryCreditTypes() {
    public override val `value`: String = "analyst"
  }

  /**
   * Documented value. Wire value: `finder`.
   */
  public data object Finder : SecurityAdvisoryCreditTypes() {
    public override val `value`: String = "finder"
  }

  /**
   * Documented value. Wire value: `reporter`.
   */
  public data object Reporter : SecurityAdvisoryCreditTypes() {
    public override val `value`: String = "reporter"
  }

  /**
   * Documented value. Wire value: `coordinator`.
   */
  public data object Coordinator : SecurityAdvisoryCreditTypes() {
    public override val `value`: String = "coordinator"
  }

  /**
   * Documented value. Wire value: `remediation_developer`.
   */
  public data object RemediationDeveloper : SecurityAdvisoryCreditTypes() {
    public override val `value`: String = "remediation_developer"
  }

  /**
   * Documented value. Wire value: `remediation_reviewer`.
   */
  public data object RemediationReviewer : SecurityAdvisoryCreditTypes() {
    public override val `value`: String = "remediation_reviewer"
  }

  /**
   * Documented value. Wire value: `remediation_verifier`.
   */
  public data object RemediationVerifier : SecurityAdvisoryCreditTypes() {
    public override val `value`: String = "remediation_verifier"
  }

  /**
   * Documented value. Wire value: `tool`.
   */
  public data object Tool : SecurityAdvisoryCreditTypes() {
    public override val `value`: String = "tool"
  }

  /**
   * Documented value. Wire value: `sponsor`.
   */
  public data object Sponsor : SecurityAdvisoryCreditTypes() {
    public override val `value`: String = "sponsor"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : SecurityAdvisoryCreditTypes() {
    public override val `value`: String = "other"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : SecurityAdvisoryCreditTypes()

  public companion object {
    public fun fromValue(`value`: String): SecurityAdvisoryCreditTypes = when (value) {
      Analyst.value -> Analyst
      Finder.value -> Finder
      Reporter.value -> Reporter
      Coordinator.value -> Coordinator
      RemediationDeveloper.value -> RemediationDeveloper
      RemediationReviewer.value -> RemediationReviewer
      RemediationVerifier.value -> RemediationVerifier
      Tool.value -> Tool
      Sponsor.value -> Sponsor
      Other.value -> Other
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<SecurityAdvisoryCreditTypes> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.SecurityAdvisoryCreditTypes", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): SecurityAdvisoryCreditTypes = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: SecurityAdvisoryCreditTypes) {
      encoder.encodeString(value.value)
    }
  }
}
