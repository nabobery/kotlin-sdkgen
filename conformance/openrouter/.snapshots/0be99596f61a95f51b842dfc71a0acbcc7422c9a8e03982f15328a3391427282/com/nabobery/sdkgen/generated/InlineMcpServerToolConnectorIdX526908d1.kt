package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/connector_id.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/connector_id
 */
@Serializable(with = InlineMcpServerToolConnectorIdX526908d1.Serializer::class)
public sealed class InlineMcpServerToolConnectorIdX526908d1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `connector_dropbox`.
   */
  public data object ConnectorDropbox : InlineMcpServerToolConnectorIdX526908d1() {
    public override val `value`: String = "connector_dropbox"
  }

  /**
   * Documented value. Wire value: `connector_gmail`.
   */
  public data object ConnectorGmail : InlineMcpServerToolConnectorIdX526908d1() {
    public override val `value`: String = "connector_gmail"
  }

  /**
   * Documented value. Wire value: `connector_googlecalendar`.
   */
  public data object ConnectorGooglecalendar : InlineMcpServerToolConnectorIdX526908d1() {
    public override val `value`: String = "connector_googlecalendar"
  }

  /**
   * Documented value. Wire value: `connector_googledrive`.
   */
  public data object ConnectorGoogledrive : InlineMcpServerToolConnectorIdX526908d1() {
    public override val `value`: String = "connector_googledrive"
  }

  /**
   * Documented value. Wire value: `connector_microsoftteams`.
   */
  public data object ConnectorMicrosoftteams : InlineMcpServerToolConnectorIdX526908d1() {
    public override val `value`: String = "connector_microsoftteams"
  }

  /**
   * Documented value. Wire value: `connector_outlookcalendar`.
   */
  public data object ConnectorOutlookcalendar : InlineMcpServerToolConnectorIdX526908d1() {
    public override val `value`: String = "connector_outlookcalendar"
  }

  /**
   * Documented value. Wire value: `connector_outlookemail`.
   */
  public data object ConnectorOutlookemail : InlineMcpServerToolConnectorIdX526908d1() {
    public override val `value`: String = "connector_outlookemail"
  }

  /**
   * Documented value. Wire value: `connector_sharepoint`.
   */
  public data object ConnectorSharepoint : InlineMcpServerToolConnectorIdX526908d1() {
    public override val `value`: String = "connector_sharepoint"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMcpServerToolConnectorIdX526908d1()

  public companion object {
    public fun fromValue(`value`: String): InlineMcpServerToolConnectorIdX526908d1 = when (value) {
      ConnectorDropbox.value -> ConnectorDropbox
      ConnectorGmail.value -> ConnectorGmail
      ConnectorGooglecalendar.value -> ConnectorGooglecalendar
      ConnectorGoogledrive.value -> ConnectorGoogledrive
      ConnectorMicrosoftteams.value -> ConnectorMicrosoftteams
      ConnectorOutlookcalendar.value -> ConnectorOutlookcalendar
      ConnectorOutlookemail.value -> ConnectorOutlookemail
      ConnectorSharepoint.value -> ConnectorSharepoint
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMcpServerToolConnectorIdX526908d1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMcpServerToolConnectorIdX526908d1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMcpServerToolConnectorIdX526908d1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMcpServerToolConnectorIdX526908d1) {
      encoder.encodeString(value.value)
    }
  }
}
