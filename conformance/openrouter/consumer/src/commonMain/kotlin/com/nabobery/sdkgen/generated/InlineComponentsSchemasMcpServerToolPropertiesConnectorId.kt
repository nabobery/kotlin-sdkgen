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
 */
@Serializable(with = InlineComponentsSchemasMcpServerToolPropertiesConnectorId.Serializer::class)
public sealed class InlineComponentsSchemasMcpServerToolPropertiesConnectorId {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `connector_dropbox`.
   */
  public data object ConnectorDropbox : InlineComponentsSchemasMcpServerToolPropertiesConnectorId() {
    public override val `value`: String = "connector_dropbox"
  }

  /**
   * Documented value. Wire value: `connector_gmail`.
   */
  public data object ConnectorGmail : InlineComponentsSchemasMcpServerToolPropertiesConnectorId() {
    public override val `value`: String = "connector_gmail"
  }

  /**
   * Documented value. Wire value: `connector_googlecalendar`.
   */
  public data object ConnectorGooglecalendar : InlineComponentsSchemasMcpServerToolPropertiesConnectorId() {
    public override val `value`: String = "connector_googlecalendar"
  }

  /**
   * Documented value. Wire value: `connector_googledrive`.
   */
  public data object ConnectorGoogledrive : InlineComponentsSchemasMcpServerToolPropertiesConnectorId() {
    public override val `value`: String = "connector_googledrive"
  }

  /**
   * Documented value. Wire value: `connector_microsoftteams`.
   */
  public data object ConnectorMicrosoftteams : InlineComponentsSchemasMcpServerToolPropertiesConnectorId() {
    public override val `value`: String = "connector_microsoftteams"
  }

  /**
   * Documented value. Wire value: `connector_outlookcalendar`.
   */
  public data object ConnectorOutlookcalendar : InlineComponentsSchemasMcpServerToolPropertiesConnectorId() {
    public override val `value`: String = "connector_outlookcalendar"
  }

  /**
   * Documented value. Wire value: `connector_outlookemail`.
   */
  public data object ConnectorOutlookemail : InlineComponentsSchemasMcpServerToolPropertiesConnectorId() {
    public override val `value`: String = "connector_outlookemail"
  }

  /**
   * Documented value. Wire value: `connector_sharepoint`.
   */
  public data object ConnectorSharepoint : InlineComponentsSchemasMcpServerToolPropertiesConnectorId() {
    public override val `value`: String = "connector_sharepoint"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMcpServerToolPropertiesConnectorId()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMcpServerToolPropertiesConnectorId = when (value) {
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

  public object Serializer : KSerializer<InlineComponentsSchemasMcpServerToolPropertiesConnectorId> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMcpServerToolPropertiesConnectorId", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMcpServerToolPropertiesConnectorId =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMcpServerToolPropertiesConnectorId) {
      encoder.encodeString(value.value)
    }
  }
}
